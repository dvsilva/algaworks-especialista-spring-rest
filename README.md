# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 14-10-implementando-remocao-e-substituicao-de-arquivos-de-fotos-no-servico-de-armazenagem
git add .
git commit -m "Implementando a remoção e substituição de arquivos de fotos no serviço de armazenagem"
git push origin 14-10-implementando-remocao-e-substituicao-de-arquivos-de-fotos-no-servico-de-armazenagem

git checkout master
git merge --no-ff 14-10-implementando-remocao-e-substituicao-de-arquivos-de-fotos-no-servico-de-armazenagem
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```