# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 14-26-selecionando-a-implementacao-do-servico-de-storage-de-fotos
git add .
git commit -m "Selecionando a implementação do serviço de storage de fotos"
git push origin 14-26-selecionando-a-implementacao-do-servico-de-storage-de-fotos

git checkout master
git merge --no-ff 14-26-selecionando-a-implementacao-do-servico-de-storage-de-fotos
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