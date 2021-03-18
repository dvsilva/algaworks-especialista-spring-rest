# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 20-12-definindo-a-versao-padrao-da-api-quando-o-media-type-nao-e-informado
git add .
git commit -m "Definindo a versão padrão da API quando o Media Type não é informado"
git push origin 20-12-definindo-a-versao-padrao-da-api-quando-o-media-type-nao-e-informado

git checkout master
git merge --no-ff 20-12-definindo-a-versao-padrao-da-api-quando-o-media-type-nao-e-informado
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